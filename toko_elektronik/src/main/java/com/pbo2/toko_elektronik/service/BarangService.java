package com.pbo2.toko_elektronik.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pbo2.toko_elektronik.model.Barang;
import com.pbo2.toko_elektronik.repository.BarangRepository;

@Service
public class BarangService {

    private final BarangRepository barangRepository;

    public BarangService(BarangRepository barangRepository) {
        this.barangRepository = barangRepository;
    }

    public List<Barang> getAllBarang() {
        return barangRepository.findAll();
    }

    public Barang getBarangByKode(String kodeBarang) {
        return barangRepository.findByKodeBarang(kodeBarang);
    }

    public void tambahBarang(Barang barang) {
        barangRepository.save(barang);
    }

    public void updateBarang(Barang barang) {
        barangRepository.save(barang); 
    }

    @Transactional
    public void hapusBarang(String kodeBarang) {
        barangRepository.deleteByKodeBarang(kodeBarang);
    }
}