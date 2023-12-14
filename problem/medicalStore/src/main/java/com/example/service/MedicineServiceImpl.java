package com.example.service;

import java.util.List;

import com.example.entity.Medicine;
import com.example.exception.MedicineNotFoundException;
import com.example.repository.MedicineRepositoryStub;

public class MedicineServiceImpl implements MedicineService{

	MedicineRepositoryStub medicineRepository=new MedicineRepositoryStub();
    
    @Override
    public Medicine getMedicine(int id) throws MedicineNotFoundException {
    	// TODO Auto-generated method stub
        return null;
    }

    @Override
	public Boolean isAvailable(int id) throws MedicineNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> manufacturers(String name) throws MedicineNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getLowestPriceByManufacturer(String medicineName) throws MedicineNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

}
