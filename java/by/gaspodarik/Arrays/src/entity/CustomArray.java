package entity;
import java.util.Arrays;
import java.util.Objects;

public class CustomArray {
    private int ArrayId;
    private int[] array;
    private int i = 0;

    public CustomArray(int[] array) {
        this.array = array;
    }

    public int getArrayId() {
        return ArrayId;
    }

    public void setArrayId(int arrayId) {
        ArrayId = arrayId;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomArray that = (CustomArray) o;
        return ArrayId == that.ArrayId && i == that.i && Arrays.equals(array, that.array);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(ArrayId, i);
        result = 31 * result + Arrays.hashCode(array);
        return result;
    }

    @Override
    public String toString() {
        return "CustomArray{" +
                "ArrayId=" + ArrayId +
                ", array=" + Arrays.toString(array) +
                ", i=" + i +
                '}';
    }
}
