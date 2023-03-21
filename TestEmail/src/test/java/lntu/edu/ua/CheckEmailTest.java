package lntu.edu.ua;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CheckEmailTest {

        @Test
    public void testValidEmail() {
        assertTrue(CheckEmail.checkEmail("tolik.koval@blynk.cloud.com"));
        assertTrue(CheckEmail.checkEmail("v.sacik@example.co.ua"));
        assertTrue(CheckEmail.checkEmail("k123.doe@edu.com"));
        assertTrue(CheckEmail.checkEmail("test3.41@lntu.edu.ua"));
        assertTrue(CheckEmail.checkEmail("l.lutsk123@gmail.com"));
    }

    @Test
    public void testInvalidEmail() {
        assertFalse(CheckEmail.checkEmail("sasha@example"));
        assertFalse(CheckEmail.checkEmail("Olia.tiguk@.com"));
        assertFalse(CheckEmail.checkEmail("r.vk1@gmail.c"));
        assertFalse(CheckEmail.checkEmail("m.vk12@gmail."));
        assertFalse(CheckEmail.checkEmail("123.johndoe@lntu.edu.com"));
        assertFalse(CheckEmail.checkEmail("Kolia@.gmail.com"));
    }

    @Test
    public void testValidEmail_2() {
        String email = "Oleh.smol@gmail.com";
        Assert.assertTrue(CheckEmail.checkEmail(email));
    }

    @Test
    public void testInvalidEmail_2() {
        String email = "2ko.var@gmail";
        Assert.assertFalse(CheckEmail.checkEmail(email));
    }

}