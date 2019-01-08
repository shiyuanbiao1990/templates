package com.openfaas.function;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @Auther: 石远彪
 * @Date: 2019/1/8 10:21
 * @Description:
 */
public class HandlerTest {

    @Test
    public void handlerIsNotNull() {
        Handler handler = new Handler();
        assertTrue("Expected handler not to be null", handler != null);
    }
}
