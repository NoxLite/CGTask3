package tests;

import org.junit.Before;
import org.junit.Test;
import vsu.cs.isit24.MathUtils.vectors.Vector2f;
import vsu.cs.isit24.MathUtils.vectors.Vector3f;
import vsu.cs.isit24.MathUtils.vectors.Vector4f;

import static org.junit.Assert.assertEquals;


public class Vector2fTests {

    Vector2f vector2f = new Vector2f(8, 6);
    Vector3f vector3f  = new Vector3f(1, 2, 2);
    Vector4f vector4f = new Vector4f(3, 3, 3, 3);


    @Test
    public void testLen() {
        assertEquals(10, vector2f.len(), 10e-6);
        assertEquals(3, vector3f.len(), 10e-6);
        assertEquals(9, vector4f.len(), 10e-6);
    }

    /* @Test
    public void testPlusMinus() {

    } */


}
