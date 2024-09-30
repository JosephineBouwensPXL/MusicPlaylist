package be.pxl.music.controller;

import be.pxl.music.domain.Song;
import be.pxl.music.service.MusicPlaylistService;
import org.slf4j.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/playlist/songs")
public class MusicPlaylistController {
    private static final Logger LOGGER = LoggerFactory.getLogger(MusicPlaylistController.class);
    private final MusicPlaylistService musicPlaylistService;
    @Autowired
    public MusicPlaylistController(MusicPlaylistService musicPlaylistService) {
        this.musicPlaylistService = musicPlaylistService;
    }
    @PostMapping
    public ResponseEntity<Void> addSong(@RequestBody Song song) {
        if (LOGGER.isInfoEnabled()) {
            LOGGER.info("Adding song [" + song.getTitle() + "]");
        }
        musicPlaylistService.addSong(song);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping
    public ResponseEntity<List<Song>> getSongs() {
        List<Song> songs = musicPlaylistService.getSongs();
        return ResponseEntity.ok(songs);
    }
}
