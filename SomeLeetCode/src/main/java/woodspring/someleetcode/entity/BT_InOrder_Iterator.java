
package woodspring.someleetcode.entity;

import java.util.Stack;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class BT_InOrder_Iterator<T> {
	private final Logger logger = LoggerFactory.getLogger(getClass());
	private Stack<T> stack = null;
	
	public BT_InOrder_Iterator() {
		stack = new Stack<>();
	}
	public BT_InOrder_Iterator(T node) {
		stack = new Stack<>();
		push( node);
	}
	
	public BT_InOrder_Iterator build( T node) {
		push( node);
		return this;
	}
	
	public T next() {
		if ( !hasNext()) {
			return null;
		}
		T retT = stack.pop();
		push( (T)(( (TreeNode)retT).right()));
		return retT;
		
	}
	
	public boolean hasNext() {
		return !stack.isEmpty();
	}
	
	public boolean remove(T node) {
		System.out.println("NOT able to operate REMOVE");
		return false;
	}
	
	private void push(T node) {
		T currentNode = node;
		while ( currentNode != null) {
			stack.push( currentNode);
			currentNode = (T) ((TreeNode)currentNode).left();
		}
		
	}
	

}
