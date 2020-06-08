package woodspring.someleetcode.entity;

public class TreeNodeIn<T, C> {
	
	private T value;
	private C content;
	private TreeNodeIn<T, C> left;
	private TreeNodeIn<T, C> right;
	
	public TreeNodeIn() {
		left = right = null;
		value = null;
		content = null;
	}

	public TreeNodeIn(T value, C content) {
		left = right = null;
		this.value = value;
		this.content = content;
	}

	public T getValue() {
		return value;
	}

	public TreeNodeIn setValue(T value) {
		this.value = value;
		return this;
	}
	
	public C content() {
		return this.content;
	}
	
	public TreeNodeIn setContent(C content) {
		this.content = content;
		return this;
	}

	public TreeNodeIn<T,C> getLeft() {
		return left();
	}
	public TreeNodeIn<T, C> left() {
		return this.left;
	}

	public void setLeft(TreeNodeIn<T,C> left) {
		this.left = left;
	}

	public TreeNodeIn<T, C> getRight() {
		return right();
	}

	public TreeNodeIn<T, C> right() {
		return this.right;
	}

	public void setRight(TreeNodeIn<T,C> right) {
		this.right = right;
	}


}
