package woodspring.someleetcode.entity;

public class TreeNode<T > {
	
	private T value;
	private TreeNode<T> left;
	private TreeNode<T> right;
	
	public TreeNode() {
		left = right = null;
		value = null;
	}

	public TreeNode(T content) {
		left = right = null;
		this.value = content;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public TreeNode<T> getLeft() {
		return left();
	}
	public TreeNode<T> left() {
		return this.left;
	}

	public void setLeft(TreeNode<T> left) {
		this.left = left;
	}

	public TreeNode<T> getRight() {
		return right();
	}

	public TreeNode<T> right() {
		return this.right;
	}

	public void setRight(TreeNode<T> right) {
		this.right = right;
	}

	
}
