package com.webczw.project.plan.server.controller;

import static org.junit.Assert.fail;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.UUID;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.alibaba.fastjson.JSONObject;
import com.webczw.project.plan.server.domain.PlanVO;
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class PlanControllerTest {
	@Autowired
	 private MockMvc mockMvc;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testFindList() {
		//fail("Not yet implemented");
	}

	@Test
	public void testFind() {
		//fail("Not yet implemented");
	}

	@Test
	public void testCreate() throws UnsupportedEncodingException, Exception {
		PlanVO planVO = new PlanVO();
		planVO.setPlanName("name010_"+UUID.randomUUID());
		planVO.setPlanStartDate(new Date());
		String requestJson = JSONObject.toJSONString(planVO);
        String responseString = mockMvc.perform( post("/plans/").contentType(MediaType.APPLICATION_JSON).content(requestJson)).andDo(print())
                .andExpect(status().isOk()).andReturn().getResponse().getContentAsString();
		System.out.println(responseString);
	}

	@Test
	public void testUpdate() {
		//fail("Not yet implemented");
	}

	@Test
	public void testDelete() {
		//fail("Not yet implemented");
	}

}
