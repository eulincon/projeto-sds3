package com.devsuperior.dsvendas.sevices;

import com.devsuperior.dsvendas.dto.SellerDTO;
import com.devsuperior.dsvendas.entities.Seller;
import com.devsuperior.dsvendas.repositories.SellerRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SellerService {
    @Autowired
    private SellerRepository repository;
    @Autowired
    private ModelMapper modelMapper;

    public List<SellerDTO> findAll() {
        List<Seller> sellers = repository.findAll();
        List<SellerDTO> sellersDTO = sellers.stream().map(seller -> modelMapper.map(seller, SellerDTO.class)).collect(Collectors.toList());
        return sellersDTO;
    }
}
