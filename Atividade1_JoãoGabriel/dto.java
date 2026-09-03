public record ClienteRequest(
    @NotBlank(message = "Nome obrigatório") String nome,
    String email
) {}