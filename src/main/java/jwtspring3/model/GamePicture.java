package jwtspring3.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "gamepicture")
public class GamePicture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_picture;

    @ManyToOne
    @JoinColumn(name = "id_game")
    private Game game;

    private String picture;
}
