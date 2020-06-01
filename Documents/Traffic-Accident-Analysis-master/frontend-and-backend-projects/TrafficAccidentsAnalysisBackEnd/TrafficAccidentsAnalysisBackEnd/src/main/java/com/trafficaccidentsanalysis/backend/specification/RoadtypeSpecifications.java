//package com.trafficaccidentsanalysis.backend.specification;
//
//import java.util.Date;
//
////import org.joda.time.DateTime;
//import org.springframework.data.jpa.domain.Specification;
//
//import com.trafficaccidentsanalysis.backend.model.Roadtype;
//
//
//
//public class RoadtypeSpecifications  {
//	
// public static Specification<Roadtype> withRoadType(String roadType) {
//	        if (roadType == null) {
//	        	
//	        	return (root, query, cb) -> cb.like(root.get("roadType"), "%%" );
//	        } else {
//	           
//	            return (root, query, cb) -> cb.equal(root.get("roadType"),  roadType );
//	        }
//	    }
//	 
// 
// public static Specification<Salesorder> withCreatedAt(Date createdAt){
//	    // Convert Date Type
//	DateTime dateTimeStart=new DateTime(createdAt);
//	dateTimeStart=dateTimeStart.plusHours(5);
//	DateTime dayTimeEnd = new DateTime(createdAt);
//    dayTimeEnd = dayTimeEnd.plusHours(28);
//    dayTimeEnd = dayTimeEnd.plusMinutes(59);
//    
//    Date DayStart=dateTimeStart.toDate();
//    Date dayEnd = dayTimeEnd.toDate();
//    
////    System.out.println("Start date ...***** " + DayStart);
////    System.out.println("day end ...**********" + dayEnd);
//
//	if(createdAt==null) {
//					 return null;
//				 }else {
//					 return(root, query, cb)->cb.between(root.get("dateTime"), DayStart,dayEnd);
//				 }
//			 }	
//
//}