package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FriendTest {

    @Test
    public void testFriendToString (){
        //given

        Friend testFriend1 = new Friend("Peter", 12345);

        //when

        String testString1 = "Peter: 12345";
        //then

        assertEquals(testFriend1, testFriend1.toString());
    }

}