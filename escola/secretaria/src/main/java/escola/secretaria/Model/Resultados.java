package escola.secretaria.Model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Resultados")
public class Resultados {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id Resultado")
    private Long id;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Matricula", referencedColumnName = "Matricula")
    private Aluno Matricula;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Id Disciplinas", referencedColumnName = "Disciplina")
    private Disciplinas IdResult;

}
