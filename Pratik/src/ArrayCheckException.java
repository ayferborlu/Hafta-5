public class ArrayCheckException extends Exception{
    public ArrayCheckException(String message) {
        super(message);

    }

    @Override
    public String toString() {
        return ("ArrayCheckException{ Array boyutu hatası ");
        //getMessage metodunu silip aşağıdakinide yazabilirsin.
        //"ArrayCheckException{ Array boyutu hatası }";
    }
}