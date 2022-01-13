//
// ReadOnlyFirst.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

internal struct ReadOnlyFirst: Codable, JSONEncodable, Hashable {

    internal var bar: String?
    internal var baz: String?

    internal init(bar: String? = nil, baz: String? = nil) {
        self.bar = bar
        self.baz = baz
    }

    internal enum CodingKeys: String, CodingKey, CaseIterable {
        case bar
        case baz
    }

    // Encodable protocol methods

    internal func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(bar, forKey: .bar)
        try container.encodeIfPresent(baz, forKey: .baz)
    }
}

