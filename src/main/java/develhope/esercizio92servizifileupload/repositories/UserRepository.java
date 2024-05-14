package develhope.esercizio92servizifileupload.repositories;

import develhope.esercizio92servizifileupload.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
