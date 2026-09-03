@Service
public class ClienteCadastroService {

    private final ClienteRepository clienteRepository;

    public ClienteCadastroService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public Cliente cadastrar(ClienteRequest request) {
        if (clienteRepository.existsByEmail(request.email())) {
            throw new EmailJaCadastradoException();
        }

        Cliente cliente = new Cliente();
        cliente.setNome(request.nome());
        cliente.setEmail(request.email());
        cliente.setAtivo(true);
        cliente.setDataCadastro(LocalDateTime.now());

        return clienteRepository.save(cliente);
    }
}