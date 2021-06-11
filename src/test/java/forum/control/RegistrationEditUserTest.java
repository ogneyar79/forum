package forum.control;

import forum.Main;
import forum.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.core.StringContains.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;



@SpringBootTest(classes = Main.class)
@AutoConfigureMockMvc
class RegistrationEditUserTest {
    @Autowired
    RegistrationEditUser controller;

    @Autowired
    private MockMvc mockMvc;
    @MockBean
    private UserService userService;
    @Test
    public void testIsController() {
        assertThat(controller).isNotNull();
        assertThat(userService).isNotNull();
    }
    @Test
    public void testPage() throws Exception {
        this.mockMvc.perform(get("/reg"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("")));
    }

//    @Test
//    @WithMockUser
//    public void shouldReturnDefaultMessage() throws Exception {
//        this.mockMvc.perform(post("/registrn")
//                .param("username", "Robert"))
//                .andDo(print())
//                .andExpect(status().is3xxRedirection());
//        ArgumentCaptor<Userr> argument = ArgumentCaptor.forClass(Userr.class);
//        verify(userService).save(argument.capture());
//        assertThat(argument.getValue().getUsername(), Is.is("Robert"));
//
//    }
//
//    @Test
//    @WithMockUser
//    public void testAddUser() throws Exception {
//        this.mockMvc.perform(get("/edit")
//                .param("id", "1"))
//                .andDo(print())
//                .andExpect(status().isOk())
//                .andExpect(view().name("edituser"));
//    }
//

}