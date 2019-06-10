package kai.coach.remake.dao;

import kai.coach.remake.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.concurrent.Future;

@Repository
public interface MessageDAO extends JpaRepository<Message, Integer> {

//    @Async
    @Query(value = "SELECT M FROM Message M WHERE M.customerRef = :customerRef")
//    Future<List<Message>> findMessagesByCustomerRef(@Param("customerId") Integer customerId);
    List<Message> findMessagesByCustomerRef(@Param("customerRef") Integer customerRef);
}
