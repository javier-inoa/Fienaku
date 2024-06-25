package bancofie.com.bo.fienaku.repository;

import bancofie.com.bo.fienaku.model.fienaku;
import bancofie.com.bo.fienaku.model.user;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface fienakuRepository extends JpaRepository<fienaku, Long> {
    List<fienaku> findByUser(user user);
}
