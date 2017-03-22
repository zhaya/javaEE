package test;

import java.util.ArrayList;
import java.util.List;

public class FindTree {
	
	private List<Node> lst = new ArrayList<Node>();
	/*
	 * 通过定义一个类定义节点
	 */
	public class Node{
		public String data;//子节点
		public String parent;//父节点
	}
	/*
	 * 给节点进行赋值，然后添加到list里面
	 */
	public void addNode(String parent,String child){
		Node n = new Node();
		n.data = child;
		n.parent = parent;
		lst.add(n);
	}
	/**
	 * 通过父节点的名字来进行查找子节点的名字,最后返回孩子节点，并且把子节点添加到List里
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
	 * 父节点只能有一个，且只有唯一的一个，直接调用方法
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
	 * 测试主方法
	 * @param args
	 */
	public static void main(String [] args){
		FindTree findTree = new FindTree();
		findTree.addNode("中国", "上海");
		findTree.addNode("中国", "北京");
		findTree.addNode("中国", "广州");
		findTree.addNode("中国", "深圳");
		findTree.addNode("河南", "郑州");
		findTree.addNode("河南", "安阳");
		findTree.addNode("河南", "周口");
		findTree.addNode("河南", "南阳");
		findTree.addNode("周口", "太康");
		findTree.addNode("周口", "扶沟");
		findTree.addNode("郑州", "上街");
		findTree.addNode("郑州", "高新区");
		findTree.addNode("郑州", "中原区");
		findTree.addNode("郑州", "登封");
		System.out.println(findTree.getChild("中国"));
		System.out.println("--------");
		System.out.println(findTree.getParent("太康"));
		
	}
}
