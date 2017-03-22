package test;

import java.util.ArrayList;
import java.util.List;

public class FindTree {
	
	private List<Node> lst = new ArrayList<Node>();
	/*
	 * ͨ������һ���ඨ��ڵ�
	 */
	public class Node{
		public String data;//�ӽڵ�
		public String parent;//���ڵ�
	}
	/*
	 * ���ڵ���и�ֵ��Ȼ����ӵ�list����
	 */
	public void addNode(String parent,String child){
		Node n = new Node();
		n.data = child;
		n.parent = parent;
		lst.add(n);
	}
	/**
	 * ͨ�����ڵ�����������в����ӽڵ������,��󷵻غ��ӽڵ㣬���Ұ��ӽڵ���ӵ�List��
	 * @param x
	 * @return
	 */
	public List<String> getChild(String x){
		List<String> l = new ArrayList<String>();
		for(int i = 0; i < lst.size(); i++){
			if(lst.get(i).parent.equals(x)){
				l.add(lst.get(i).data);
			}
		}
		return l;
	}
	/**
	 * ���ڵ�ֻ����һ������ֻ��Ψһ��һ����ֱ�ӵ��÷���
	 * @param x
	 * @return
	 */
	public String getParent(String x){
		for(int i = 0; i < lst.size(); i++){
			if(lst.get(i).data.equals(x)){
				return lst.get(i).parent;
			}
		}
		return null;
	}
	/**
	 * ����������
	 * @param args
	 */
	public static void main(String [] args){
		FindTree findTree = new FindTree();
		findTree.addNode("�й�", "�Ϻ�");
		findTree.addNode("�й�", "����");
		findTree.addNode("�й�", "����");
		findTree.addNode("�й�", "����");
		findTree.addNode("����", "֣��");
		findTree.addNode("����", "����");
		findTree.addNode("����", "�ܿ�");
		findTree.addNode("����", "����");
		findTree.addNode("�ܿ�", "̫��");
		findTree.addNode("�ܿ�", "����");
		findTree.addNode("֣��", "�Ͻ�");
		findTree.addNode("֣��", "������");
		findTree.addNode("֣��", "��ԭ��");
		findTree.addNode("֣��", "�Ƿ�");
		System.out.println(findTree.getChild("�й�"));
		System.out.println("--------");
		System.out.println(findTree.getParent("̫��"));
		
	}
}
