package com.azu.watchHelper02;

import com.azu.watchHelper02.Controller.HotMoviesController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(HotMoviesController.class)
public class HotMoviesControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testGetHotMovies() throws Exception {
        int cityId = 20;
        String cityName = "广州";

        MvcResult mvcResult = mockMvc.perform(get("/movie/hot")
                        .param("ci", String.valueOf(cityId))
                        .param("ct", cityName))
                .andExpect(status().isOk())
                .andReturn();

        String result = mvcResult.getResponse().getContentAsString();
        System.out.println("真实请求获取的热门电影数据结果: " + result);
    }
}