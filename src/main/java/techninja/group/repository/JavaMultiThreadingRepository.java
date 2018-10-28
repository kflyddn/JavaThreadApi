package techninja.group.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import techninja.group.model.JavaMultiThreading;;

@Repository
public interface JavaMultiThreadingRepository extends MongoRepository<JavaMultiThreading,String>{

		public void deleteByLocation(String location);
}
