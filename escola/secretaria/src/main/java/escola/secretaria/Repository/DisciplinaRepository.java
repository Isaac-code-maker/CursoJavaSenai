package escola.secretaria.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import escola.secretaria.Model.Aluno;
import escola.secretaria.Model.DisciplinasModel;

public interface DisciplinaRepository extends JpaRepository<DisciplinasModel, Integer> {

}
