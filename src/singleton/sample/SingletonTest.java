package singleton.sample;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

class SingletonTest {

    @Test
    void インスタンスが1つであること() {
        Singleton single1 = Singleton.getInstatnce();
        Singleton single2 = Singleton.getInstatnce();
        assertThat(single1, is(single2));
    }
}
