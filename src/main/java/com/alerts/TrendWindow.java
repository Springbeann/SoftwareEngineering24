package com.alerts; 

import java.util.ArrayList;

public class TrendWindow {
    private Patient patient; 

    public TrendWindow(Patient patient){
        this.patient = patient; 
    }
    public List<Double> getWindowValues(int patientID, long startTime, long endTime, String recordType) {
        List<Double> windowValues = new ArrayList<>();
        List<PatientRecord> records = patient.getRecords(startTime, endTime);
        for (PatientRecord record : records) {
            if (record.getRecordType().equals(recordType)) {
                windowValues.add(record.getMeasurementValue());
            }
        }
        return windowValues;
    }

    
}
