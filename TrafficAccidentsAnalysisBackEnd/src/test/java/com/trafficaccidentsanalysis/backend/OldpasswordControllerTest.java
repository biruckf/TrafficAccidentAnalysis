package com.trafficaccidentsanalysis.backend;

import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.aspectj.lang.annotation.Before;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.trafficaccidentsanalysis.backend.controller.AccidentController;
import com.trafficaccidentsanalysis.backend.model.Accident;
import com.trafficaccidentsanalysis.backend.repository.AccidentRepository;
import com.trafficaccidentsanalysis.backend.service.AccidentService;

@RunWith(MockitoJUnitRunner.class)
public class AccidentControllerTest {
	
	AccidentController accidentController;
	
	@Mock
    AccidentService accidentService;
	
	@Mock
    AccidentRepository  accidentRepository;


	
	@Before(value = "accidentController") 
    public void setUp() throws Exception  {
        
	}
	@After
    public void tearDown() {
        accidentController = null;
        accidentService = null;
        accidentRepository = null;       
    }
	
	@Test
    public void testAccident() throws Exception {
		List<Accident> mockAccident = new ArrayList<Accident>();
		Accident macc = new Accident();
		macc.getAccidentid();
		macc.getAccidentType();
		macc.getAdditionalInfo();
		macc.getAddressLocation();
		macc.getAddressLocation();
		macc.getAttachments();
		macc.getCity();
	}
         
        
	}






/*
 * package com.trafficaccidentsanalysis.backend;
 * 
 * import java.util.ArrayList; import java.util.List;
 * 
 * import org.junit.Before; import org.junit.*; import org.junit.Test; import
 * org.junit.runner.RunWith; import org.mockito.Mock; import
 * org.mockito.Mockito; import
 * org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.boot.test.context.SpringBootTest; import
 * org.springframework.http.MediaType; import
 * org.springframework.test.context.junit4.SpringJUnit4ClassRunner; import
 * org.springframework.test.web.servlet.MockMvc; import
 * org.springframework.test.web.servlet.MvcResult; import
 * org.springframework.test.web.servlet.request.MockMvcRequestBuilders; import
 * org.springframework.test.web.servlet.setup.MockMvcBuilders; import
 * org.springframework.web.context.WebApplicationContext;
 * 
 * import com.trafficaccidentsanalysis.backend.controller.OldpasswordController;
 * import com.trafficaccidentsanalysis.backend.model.Oldpassword; import
 * com.trafficaccidentsanalysis.backend.service.OldpasswordService;
 * 
 * @RunWith(SpringJUnit4ClassRunner.class)
 * 
 * @SpringBootTest public class OldpasswordControllerTest {
 * 
 * @Autowired private MockMvc mockMvc;
 * 
 * @Mock private OldpasswordService oldPassWordService;
 * 
 * @Autowired private WebApplicationContext webApplicationContext;
 * 
 * @Autowired private OldpasswordController oldpasswordController;
 * 
 * @Before public void setUp() throws Exception{ mockMvc =
 * MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
 * 
 * @Test public void testOldpasswordController() throws Exception{
 * List<Oldpassword> mockOldpassword = new ArrayList<Oldpassword>(); Oldpassword
 * macc = new Oldpassword(); macc.setOldPassword("oldPassword");
 * macc.setOldPasswordHash(null); mockOldpassword.add(macc);
 * 
 * Mockito.when(oldpasswordService.getAllOldpassword()).thenReturn((
 * mockoldpassword)); String URI = "/trafficaccidentanalysis/accident/getall";
 * RequestBuilder requestBuilder =MockMvcRequestBuilders.get(
 * URI).accept(MediaType.APPLICATION_JSON);
 * 
 * MvcResult result = mockMvc.perform(requestBuilder).andReturn();
 * 
 * String expectedJson = this.mapToJson(mockOldpassword); String outputInJson =
 * result.getResponse().getContentAsString();
 * assertThat(outputInJson).isEqualTo(expectedJson);
 * 
 * 
 * } } }
 * 
 * 
 */