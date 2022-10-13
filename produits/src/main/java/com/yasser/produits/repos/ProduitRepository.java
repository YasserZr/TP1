package com.yasser.produits.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yasser.produits.entities.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long> {
	
}