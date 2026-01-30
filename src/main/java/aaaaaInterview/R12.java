//package aaaaaInterview;
//
//
//import java.sql.Timestamp;
//import java.time.ZoneId;
//import java.time.ZonedDateTime;
//import java.util.Optional;
//
//public class R12 {
//
//    // can you write complete Unti test below listne() method with all autowire mock everything to satify all steps and mock the data
//    //  I have a Kafka consumer
//
//
//    public void listen(ConsumerRecord<String, GenericRecord> event, Acknowlegment acknowledgement) throws kafkaException {
//      //we are consume a even which has a record with two data ecid and ultEcid
//        Notification notification = new Notification();    //Notification is a entity class which is store ecid, ultEcid and other fields to process we are only caring ecid and ultEcid field here
//        GenericRecord record = event.value() ;    // this record contains two fields eci and ultEci
//
//        //step 1 : get ecid value from event
//        String ecidCheck = (String) event.get("ecid");     //want to return some string value like "2"
//
//        //step 2 : get ultEcid value from event
//        String ultEcidCheck = (String) event.get("ultEcid");     //want to return some string value like "1"
//
//        //Check if this ecid is present in database or not
//        Integer ecidExist = partyDataRepository.existsByEci(ecidCheck); // wnt to mock check if that ecid "2" is present or not
//
//         //step 3 : if ecidExist is null then dont do anything and return and if it is already present then go step 4
//        if(ecidExist ==null) {
//            acknowlegment.acknowledge();
//            return;             //for this write both testcase for null case or not null case;
//        }
//
//        //step 4 : check if ultEcidCheck is not null and not empty
//        if(ultEcidCheck !=null && !ultEcidCheck.isEmpty()) {
//           //step 5 : find record from database by it ecidCheck
//            Optional<PartyData> databaseRecord = partyDataRepository.findByEci(ecidCheck);   //PartyData is entity which contains ecid and ultEcid so in record we want to mock some data with ecid and ultEcid
//
//            //step 6 : if databaseRecord is not empty and databse record has utlEcid and this ultEcid value is not equal to utlEcid which we consuming from event
//            if(databaseRecord.isPresent() && databaseRecord.get().getUltEcid() != null && !databaseRecord.get().getultEcid(ultEcidCheck)) { //I want to make true and test
//               notification.setUltEcid(ultEcidCheck);
//
//               //above if condition is satisfied then get that record whose ecid is same as ecid we are consuming from even message
//                Optional<PartyData> databaseRecordToBeUpdated = partyDataRepository.findByEcid(ecidCheck);
//
//                //if above if condition satify we want get PartyData record for that ecid and update it ultEcid and create a new PartyData record with ecid = ultEcid of consumed data and its ultEcid value = null
//                if(databaseRecordToBeUpdated.isPresent()){
//                    ZonedDateTime nowCST = ZonedDateTime.now(ZoneId.of("Ameica/Chicago"));
//                    Timestamp timestamp = Timestamp.valueOf(nowCST.toLocalDateTime());
//                    PartyData entity = databaseRecordToBeUpdated.get();
//                    entity.setUltEcid(ultEcidCheck);
//                    entity.setEciddUpdateDateTime(timestamp);
//                    entity.setUltEcidUpdateDateTime(timestamp);
//                    partyDataRepository.save(entity);
//                }
//                ZonedDateTime nowCST = ZonedDateTime.now(ZoneId.of("Ameica/Chicago"));
//                Timestamp timestamp = Timestamp.valueOf(nowCST.toLocalDateTime());
//                PartyData entity = new PartyData(ultEcidCheck,null,timestamp,timestamp);
//                partyDataRepository.save(entity);
//                } else {
//                notification.setUltEcid(null);
//            }
//
//            //here setting other values of notification
//            }
//            }
//
//}
