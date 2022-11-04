package aula3;

import java.util.Optional;

public class MainAula3 {

	public static void main(String[] args) {
	
//		PinPad pinPad = buscar(5);
//		System.out.println("o codigo do pinpad e: " +pinPad.id.length());
//
//		Optional<PinPad> optPinPad = buscar2(6);
//		if(optPinPad.isPresent()) {
//			pinPad = optPinPad.get();
//			System.out.println("o codigo do pinpad e: "
//										+pinPad.id);
//		}else {
//			System.out.println("pinpad  nao encontrado");
//		}
		// acoplamento temporal, solução
		Funcionario funcionario = new Funcionario();
		ValidacaoOK validacaoOK =  validarFuncionario(funcionario);
		SalvarOK salvarOK = salvarFuncionario(funcionario,validacaoOK);
		registarLog(salvarOK);
		
	}
	
	
	public static ValidacaoOK validarFuncionario(Funcionario funcionario) {		
		
		return new ValidacaoOK();
	}
	
	public static SalvarOK salvarFuncionario(Funcionario funcionario,ValidacaoOK validacaoOK) {
		
		return new SalvarOK();
	}
	
	public static void registarLog(SalvarOK salvarOK) {
		
	}
	
	public static Optional<PinPad> buscar2(int id) {
		PinPad pinPad = new PinPad(); // busca o pinpad no banco de dados
		return Optional.ofNullable(pinPad);		
	}
	
	public static PinPad buscar(int id) {
		PinPad pinPad = null; // busca o pinpad no banco de dados
		if(pinPad == null) {
			pinPad = new PinPadNaoEncontrado();
		}
		return pinPad;
	}
	
	

}
