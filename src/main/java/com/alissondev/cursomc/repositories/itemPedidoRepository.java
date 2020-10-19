package com.alissondev.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alissondev.cursomc.domain.ItemPedido;

@Repository
public interface itemPedidoRepository extends JpaRepository <ItemPedido, Integer>{

}
