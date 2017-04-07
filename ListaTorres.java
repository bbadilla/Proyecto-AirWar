public class ListaTorres 
{
    class Node {
        private Object elem;
        private Node Next;

        public Node(Object o) {
          elem = o;
          Next = null;
        }
        
        public Object getValor() {
            return elem;
        }
    
        public void setValor(Object elem) {
            this.elem = elem;
        }
    
        public Node getNext() {
            return Next;
        }
    
        public void setNext(Node Next) {
            this.Next = Next;
        }   
}
      

      private Node end;
      private int size;

      public ListaTorres() {
        this.end = null;
        this.size = 0;
      }

      public void agregarFinal(Object o) {
        Node new_node = new Node(o);
        if (this.end == null)
          this.end = new_node;
        else {
          new_node.Next = end;
          end = new_node;
        }
        
        size++;
      }; // inserts an object onto the stack

      public Object eliminarFinal() {
        if (end == null)
          return null;
        ;
        Object o = end.elem;
        end = end.Next;
        size--;
        return o;
      }// Gets the object from the stack

      public boolean isEmpty() {

        return (size == 0);
      }

      public int size() {
          
        
        return size;
      }

      public Object mostrar() {

        if (end == null)
          return null;
        else
          return end.elem;
      }

} 
