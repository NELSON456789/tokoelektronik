package com.pbo2.toko_elektronik.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pbo2.toko_elektronik.model.Barang;

@Repository
public interface BarangRepository extends JpaRepository<Barang, Long> {
    
    Barang findByKodeBarang(String kodeBarang);
    
    void deleteByKodeBarang(String kodeBarang);
}