import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    @org.junit.jupiter.api.Test
    void value() {
        int [] number = {2,2,2};
        int [] result = TriangleClassifier.tamGiacCan(2,2,2);
        assertArrayEquals(number,result);
    }
}