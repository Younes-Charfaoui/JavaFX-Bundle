package me.mxcsyounes.fxbundle;

import org.junit.Assert;
import org.junit.Test;

import java.net.URL;

public class FXBundleControllerTest {

    @Test
    public void initialize() {
        FXBundle bundle = new FXBundle.Builder()
                .putExtra("hi", "hi")
                .putExtra("int", 2)
                .build();
        TestController controller = new TestController();
        controller.initialize(getClass().getResource("LICENSE"), bundle);
    }


    private class TestController extends FXBundleController {

        public void initializeController(URL location, FXBundle bundle) {
            Assert.assertEquals(bundle.getIntExtra("int"), 2);
        }
    }
}