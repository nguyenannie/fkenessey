package com.greenfoxacademy.pallidaretake.services;

import com.greenfoxacademy.pallidaretake.models.Merchandise;
import com.greenfoxacademy.pallidaretake.repositories.MerchandiseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MerchandiseServiceDbImpl implements MerchandiseService {

  @Autowired
  MerchandiseRepository merchandiseRepository;

  @Override
  public List<Merchandise> listAllMerchandise() {
    return (List<Merchandise>) merchandiseRepository.findAll();
  }

  @Override
  public List<String> listAllDistinctItemNames() {
    return (List<String>) merchandiseRepository.findAllDistinctItemNames();
  }

  @Override
  public List<Merchandise> listAllSelectedItemName(Merchandise selectedMerchandise) {
    return (List<Merchandise>) merchandiseRepository.findAllByItemName(selectedMerchandise.getItemName());
  }
}
