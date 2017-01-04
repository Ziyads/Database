public class test{
	private boolean areMirror(BTNode<T> t1, BTNode<T> t2){
		if(t1.left.left != null){
			areMirror(t1.left,t2.left);
		}
		if(!t1.left.data.equals(t2.left.data))
			return false;
			
		
		if(!t1.data.equals(t2.data))
			return false;
		
		
		
		if(t1.right.right != null){
			areMirror(t1.right,t2.right);
		}	
		if(!t1.right.data.equals(t2.right.data))
			return false;
			
	
	
	
	}
	
	if(t1.left != null && t2.left != null)
		areMirror(t1.left,t2.left);
		
	if(t1.left!=null || t2.left != null)
		return false;
		
	if(!t1.data.equals(t2.data))
		return false;
	
	if(t1.right != null && t2.right != null)
		areMirror(t1.left,t2.left);
		
	if(t1.right !=null || t2.right != null)
		return false;
		
	if(!t1.data.equals(t2.data))
		return false;
	

	private void swap(BTNode<T> t){
		if(t.left!=null){
			t.data=t.left.data;
			swap(t.left);
		}
		
	
	
	}










}