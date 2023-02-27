package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

//    File > Setting (Ctrl+Alt+S)
//    Build, Execution, Deployment > Build Tools > gradle
//    Run Tests using: Intellij IDEA

public class SquareTests {

    @Test
    public void testArea() {
        Square s = new Square(5);
        Assert.assertEquals(s.area(), 25);
    }
}
