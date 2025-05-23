package com.aut.edutech.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aut.edutech.model.Ticket;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long>{
    
}
