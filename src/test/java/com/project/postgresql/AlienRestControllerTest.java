package com.project.postgresql;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.ResultMatcher;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = PostgresqlApplication.class)
@AutoConfigureMockMvc    // used for Configure Spring MVC tests.
@TestPropertySource(locations = "classpath:application.properties")
public class AlienRestControllerTest
{
    @MockBean
    AlienRepository AlienRepo;

    @MockBean
    private AlienController controller;

    @Autowired
    private MockMvc MockMvc;

    @Test
    public void AlienTest() throws Exception 
    {
        MockMvc.perform(get("/aliens"))
            .andExpect(status().isOk())
            .andExpect((ResultMatcher) ( ((ResultActions) jsonPath("$.id", is(101))))
            .andExpect((ResultMatcher) ( (ResultActions) jsonPath("$.fname", is("Serena"))))
            .andExpect((ResultMatcher) ( jsonPath("$.lname", is("Williams")))));

    } 

    private Object is(String string) {
        return null;
    }

    private Object is(int i) {
        return null;
    }

    private RequestBuilder get(String string) {
        return null;
    }

    private Object jsonPath(String string, Object object) {
        return null;
    }



// Integration TEST 

    @Test
    public void findAll() throws Exception {
        MockMvc.perform((RequestBuilder) ((ResultActions) get("/alien/value"))
            .andExpect(status().isOk())
            .andExpect((ResultMatcher)jsonPath("$", hasSize(2)))
            .andExpect((ResultMatcher)jsonPath("$[0].id", is(101)))
            .andExpect((ResultMatcher)jsonPath("$[0].fname", is("Serena")))
            .andExpect((ResultMatcher)jsonPath("$[0].lname", is("Williams")))
            .andExpect((ResultMatcher)jsonPath("$[1].id", is(102)))
            .andExpect((ResultMatcher)jsonPath("$[1].fname", is("Cole")))
            .andExpect((ResultMatcher)jsonPath("$[1].lname", is("Sprouse"))));
        }

    private Object hasSize(int i) {
        return null;
    }
}
