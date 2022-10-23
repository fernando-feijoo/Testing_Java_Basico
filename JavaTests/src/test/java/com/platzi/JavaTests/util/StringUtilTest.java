package com.platzi.JavaTests.util;

import org.junit.Assert;
import org.junit.Test;
public class StringUtilTest {
    @Test
    public void repeat_string_once(){
        Assert.assertEquals("Hola", StringUtil.repeat("hola", 1));
    }

}