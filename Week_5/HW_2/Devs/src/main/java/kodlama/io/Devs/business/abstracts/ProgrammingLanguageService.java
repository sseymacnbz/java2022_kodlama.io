package kodlama.io.Devs.business.abstracts;

import java.util.List;

import kodlama.io.Devs.business.requests.CreateProgrammingLanguageRequest;
import kodlama.io.Devs.business.requests.DeleteProgrammingLanguageRequest;
import kodlama.io.Devs.business.requests.GetLanguageByIdRequest;
import kodlama.io.Devs.business.requests.UpdateProgrammingLanguageRequest;
import kodlama.io.Devs.business.responses.GetAllProgrammingLanguagesResponse;
import kodlama.io.Devs.business.responses.GetLanguageByIdResponse;

public interface ProgrammingLanguageService {
	List<GetAllProgrammingLanguagesResponse> getAll();
	void add(CreateProgrammingLanguageRequest createProgrammingLanguageRequest) throws Exception;
	void delete(DeleteProgrammingLanguageRequest deleteProgrammingLanguageRequest);
	void update(UpdateProgrammingLanguageRequest updateProgrammingLanguageRequest);
	GetLanguageByIdResponse getById(GetLanguageByIdRequest getLanguageByIdRequest);
}
