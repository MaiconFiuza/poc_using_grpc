package repository;

import jakarta.enterprise.context.ApplicationScoped;
import model.entities.Artist;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

@ApplicationScoped
public class ArtisRepository implements PanacheRepository<Artist>{
}
