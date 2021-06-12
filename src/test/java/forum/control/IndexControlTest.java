package forum.control;

import forum.Main;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;


@SpringBootTest(classes = Main.class)
@AutoConfigureMockMvc
class IndexControlTest {


    @Autowired
    private MockMvc mockMvc;

//    @Test
//    @WithMockUser
//    public void shouldReturnDefaultMessage() throws Exception {
//        this.mockMvc.perform(get("/index"))
//                .andDo(print())
//                .andExpect(status().isOk())
//                .andExpect(view().name("index"));
//    }
}