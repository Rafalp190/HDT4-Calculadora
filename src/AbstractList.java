public abstract class AbstractList<E> implements I_Lista<E>
{
    Node<E> tempILista = null;

    public AbstractList()
   // post: does nothing
   {
   }

   public boolean isEmpty()
   // post: returns true iff list has no elements
   {
      return size() == 0;
   }

   public boolean contains(E value)
      // pre: value is not null
      // post: returns true iff list contains an object equal to value
      {
        return -1 != indexOf(value);
      }

        //Metodos que no se utilizan
        public int size() {
            return 0;
        }
        public E get() {
            return tempILista.value();
        }

        public void clear() {
        }

        public E getFirst() {
            return tempILista.value();
        }

        public E getLast() {
            return tempILista.value();
        }

        public E removeFirst() {
            return tempILista.value();
        }

        public E remove(E value) {
            return tempILista.value();
        }

        public void add (E value) {

        }

        public E remove() {
            return tempILista.value();
        }

        public int indexOf (E value) {
            return 0;
        }

        public int lastIndexOf(E value) {
            return 0;
        }

        public E get(int i) {
            return tempILista.value();
        }

        public E set(int i, E o) {
            return tempILista.value();
        }

        public void add(int i, E o) {

        }

        public E remove(int i) {
            return tempILista.value();
        }

}