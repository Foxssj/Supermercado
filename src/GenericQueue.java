public class GenericQueue<T> {
        private static final int CAPACIDAD_INICIAL = 5;
        private static final int TOP = 0;

        private GenericCollection<T> collection = new GenericCollection<T>(CAPACIDAD_INICIAL);

        public void enqueue(T element) {
                collection.add(element);
        }

        public T pop(){
                return collection.delete(TOP);
        }

}
