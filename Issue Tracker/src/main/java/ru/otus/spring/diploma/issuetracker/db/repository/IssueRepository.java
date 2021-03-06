package ru.otus.spring.diploma.issuetracker.db.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;
import ru.otus.spring.diploma.issuetracker.db.dpo.IssueDpo;

public interface IssueRepository extends ReactiveMongoRepository<IssueDpo, String> {
    Mono<IssueDpo> findByVisibleIdAndDomain(String visibleId, String domain);
}
