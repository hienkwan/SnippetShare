CREATE TABLE snippets (
    id BIGSERIAL PRIMARY KEY,
    content TEXT NOT NULL,
    language VARCHAR(20) NOT NULL,
    created_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- Trigger function to update the updated_date column
CREATE OR REPLACE FUNCTION update_updated_date_column()
RETURNS TRIGGER AS $$
BEGIN
   NEW.updated_date = NOW();
   RETURN NEW;
END;
$$ LANGUAGE plpgsql;

-- Trigger to call the function before an update
CREATE TRIGGER update_snippet_updated_date
BEFORE UPDATE ON snippets
FOR EACH ROW
EXECUTE FUNCTION update_updated_date_column();

INSERT INTO snippets (content, language) VALUES
('This is a snippet in Python', 'Python'),
('This is a snippet in JavaScript', 'JavaScript'),
('This is a snippet in Java', 'Java'),
('This is a snippet in C++', 'C++'),
('This is a snippet in Ruby', 'Ruby');