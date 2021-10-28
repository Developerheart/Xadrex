package tabuleiro;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Position {

    private int row;
    private int column;

    @Override
    public String toString() {
        return "R-" + row + " : C-" + column;
    }
}
