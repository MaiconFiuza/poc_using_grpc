package model.entities.mapper;

import fiuza.maicon.artist.ArtistProto;
import fiuza.maicon.artist.CreateArtistRequest;
import fiuza.maicon.artist.GetArtistResponse;
import fiuza.maicon.artist.MusicalGenreProto;
import model.entities.Artist;
import model.enums.MusicalGenre;

public class EntityManagerMapper {

    public static Artist toEntity(CreateArtistRequest request) {
        return new Artist(
                request.getNome(), MusicalGenre.valueOf(request.getMusicalGenre().name()), request.getMostFamousSong()
        );
    }

    public static GetArtistResponse toGetArtistResponse(Artist artist) {
        return GetArtistResponse.newBuilder().setArtist(
                ArtistProto.newBuilder()
                        .setArtistId(artist.getId())
                        .setNome(artist.getNome())
                        .setMusicalGenre(MusicalGenreProto.valueOf(artist.getMusicalGenre().name()))
                        .setMostFamousSong(artist.getMostFamousSong())
        ).build();
    }
}
